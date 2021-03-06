import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.HealthCheckSrv;
import com.fanap.podSakku.data.modelVo.AddAppHealthCheckVo;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.HealthCheckVo;
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

public class TestAddAppHealthCheckVoSrv {
    private static String TOKEN = "";

    @Test
    public void addAppHealthCheck_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        HealthCheckVo healthCheckVo = new HealthCheckVo();
        healthCheckVo.setScheme("http");
        healthCheckVo.setEndpoint("/ping");
        healthCheckVo.setResponseString("pong");
        try {
            AddAppHealthCheckVo addAppHealthCheckVo = new AddAppHealthCheckVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setHealthCheckVoVO(healthCheckVo)
                    .build();
            podSakku.addAppHealthCheck(addAppHealthCheckVo, new OnGetResponseListener<List<HealthCheckSrv>>() {
                @Override
                public void onResponse(ResultVo<List<HealthCheckSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                    try {
                        assertEquals(HealthCheckSrv.Status.FAILED, result.getResult().get(0).getLastStatus());
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
    public void addAppHealthCheck_RequiredParameters_Id() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        HealthCheckVo healthCheckVo = new HealthCheckVo();
        healthCheckVo.setScheme("http");
        healthCheckVo.setEndpoint("/ping");
        healthCheckVo.setResponseString("pong");
        try {
            AddAppHealthCheckVo addAppHealthCheckVo = new AddAppHealthCheckVo.Builder(baseInfoVo)
                    .setHealthCheckVoVO(healthCheckVo)
                    .build();
            podSakku.addAppHealthCheck(addAppHealthCheckVo, new OnGetResponseListener<List<HealthCheckSrv>>() {
                @Override
                public void onResponse(ResultVo<List<HealthCheckSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
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

    @Test
    public void addAppHealthCheck_RequiredParameters_HealthCheckVO() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        HealthCheckVo healthCheckVo = new HealthCheckVo();
        healthCheckVo.setScheme("http");
        healthCheckVo.setEndpoint("/ping");
        healthCheckVo.setResponseString("pong");
        try {
            AddAppHealthCheckVo addAppHealthCheckVo = new AddAppHealthCheckVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .build();
            podSakku.addAppHealthCheck(addAppHealthCheckVo, new OnGetResponseListener<List<HealthCheckSrv>>() {
                @Override
                public void onResponse(ResultVo<List<HealthCheckSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
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

    @Test
    public void addAppHealthCheck_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            AddAppHealthCheckVo addAppHealthCheckVo = new AddAppHealthCheckVo.Builder(baseInfoVo)
                    .build();
            podSakku.addAppHealthCheck(addAppHealthCheckVo, new OnGetResponseListener<List<HealthCheckSrv>>() {
                @Override
                public void onResponse(ResultVo<List<HealthCheckSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
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
