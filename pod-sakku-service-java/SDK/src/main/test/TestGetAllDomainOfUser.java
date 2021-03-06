import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.UserDomainSrv;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.GetAllDomainsOfUserVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestGetAllDomainOfUser {
    private static String TOKEN = "";

    @Test
    public void getAllDomainOfUser_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetAllDomainsOfUserVo getAllDomainsOfUserVo = new GetAllDomainsOfUserVo.Builder(baseInfoVo)
                    .build();
            podSakku.getAllDomainsOfUser(getAllDomainsOfUserVo, new OnGetResponseListener<List<UserDomainSrv>>() {
                @Override
                public void onResponse(ResultVo<List<UserDomainSrv>> result) {
                    System.out.println(result.getResult());
                    try {
                        assertEquals("makbn.ir", result.getResult().get(0).getDomain());
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
    public void getAllDomainOfUser_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetAllDomainsOfUserVo getAllDomainsOfUserVo = new GetAllDomainsOfUserVo.Builder(baseInfoVo)
                    .build();
            podSakku.getAllDomainsOfUser(getAllDomainsOfUserVo, new OnGetResponseListener<List<UserDomainSrv>>() {
                @Override
                public void onResponse(ResultVo<List<UserDomainSrv>> result) {
                    System.out.println(result.getResult());
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
