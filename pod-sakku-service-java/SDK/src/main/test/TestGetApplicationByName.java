import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.ApplicationSrv;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.GetApplicationByNameVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestGetApplicationByName {
    private static String TOKEN = "";

    @Test
    public void getApplicationByName_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetApplicationByNameVo getApplicationByNameVo = new GetApplicationByNameVo.Builder(baseInfoVo)
                    .setName("elhamapp1")
                    .build();
            podSakku.getApplicationByName(getApplicationByNameVo, new OnGetResponseListener<ApplicationSrv>() {
                @Override
                public void onResponse(ResultVo<ApplicationSrv> result) {
                    System.out.println(result.getResult().getId());
                    try {
                        assertEquals("2334", result.getResult().getId());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }

                @Override
                public void onFailed(PodException e) {
                    try {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void getApplicationByName_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetApplicationByNameVo getApplicationByNameVo = new GetApplicationByNameVo.Builder(baseInfoVo)
                    .build();
            podSakku.getApplicationByName(getApplicationByNameVo, new OnGetResponseListener<ApplicationSrv>() {
                @Override
                public void onResponse(ResultVo<ApplicationSrv> result) {
                    System.out.println(result.getResult().getId());
                    try {
                        fail();
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }

                @Override
                public void onFailed(PodException e) {
                    try {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

}
