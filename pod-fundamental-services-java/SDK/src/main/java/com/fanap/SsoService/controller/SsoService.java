package com.fanap.SsoService.controller;

import com.fanap.SsoService.data.modelVo.*;
import com.fanap.SsoService.exception.SsoServiceException;
import com.fanap.SsoService.service.Service;
import com.fanap.SsoService.util.interfaces.*;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class SsoService {

    private static final String MESSAGE = "onGetResponseListener can not be null!";
    private static Service service = new Service();
    private static String baseURL;

    /**
     * Get access token.
     *
     * @param authorizeVo
     * @param onGetResponseListenerAuthorize A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                       InvalidParameterException will be thrown.
     * @return
     * @throws SsoServiceException
     */
    public SsoService authorize(AuthorizeVo authorizeVo,
                                OnGetResponseListenerAuthorize onGetResponseListenerAuthorize)
            throws SsoServiceException {

        if (onGetResponseListenerAuthorize != null)
            service.authorize(authorizeVo, onGetResponseListenerAuthorize);

        else throw SsoServiceException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * Get access token.
     *
     * @param verifyVo
     * @param onGetResponseListenerVerify A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                    InvalidParameterException will be thrown.
     * @return
     * @throws SsoServiceException
     */
    public SsoService verify(VerifyVo verifyVo,
                             OnGetResponseListenerVerify onGetResponseListenerVerify)
            throws SsoServiceException {

        if (onGetResponseListenerVerify != null)
            service.verify(verifyVo, onGetResponseListenerVerify);

        else throw SsoServiceException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Get access token.
     *
     * @param getAccessTokenByOtpVo
     * @param onGetResponseListenerGetAccessTokenOtp A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                               InvalidParameterException will be thrown.
     * @return
     * @throws SsoServiceException
     */
    public SsoService getAccessTokenByOtp(GetAccessTokenByOtpVo getAccessTokenByOtpVo,
                                          OnGetResponseListenerGetAccessTokenOtp onGetResponseListenerGetAccessTokenOtp)
            throws SsoServiceException {

        if (onGetResponseListenerGetAccessTokenOtp != null)
            service.getAccessTokenOtp(getAccessTokenByOtpVo, onGetResponseListenerGetAccessTokenOtp);

        else throw SsoServiceException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Get access token.
     *
     * @param accessTokenVo
     * @param onGetResponseListenerGetAccessToken A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                            InvalidParameterException will be thrown.
     * @return
     * @throws SsoServiceException
     */
    public SsoService getAccessToken(AccessTokenVo accessTokenVo,
                                     OnGetResponseListenerGetAccessToken onGetResponseListenerGetAccessToken)
            throws SsoServiceException {

        if (onGetResponseListenerGetAccessToken != null)
            service.getAccessToken(accessTokenVo, onGetResponseListenerGetAccessToken);

        else throw SsoServiceException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Get access token using refresh token.
     *
     * @param refreshAccessTokenVo
     * @param onGetResponseListenerRefreshAccessToken A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                                InvalidParameterException will be thrown.
     * @return
     * @throws SsoServiceException
     */
    public SsoService refreshAccessToken(RefreshAccessTokenVo refreshAccessTokenVo,
                                         OnGetResponseListenerRefreshAccessToken onGetResponseListenerRefreshAccessToken)
            throws SsoServiceException {

        if (onGetResponseListenerRefreshAccessToken != null)
            service.getAccessTokenUsingRefreshToken(refreshAccessTokenVo, onGetResponseListenerRefreshAccessToken);

        else throw SsoServiceException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Get token info.
     *
     * @param tokenInfoVo
     * @param onGetResponseListenerGetTokenInfo A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                          InvalidParameterException will be thrown.
     * @return
     * @throws SsoServiceException
     */
    public SsoService getTokenInfo(TokenInfoVo tokenInfoVo,
                                   OnGetResponseListenerGetTokenInfo onGetResponseListenerGetTokenInfo)
            throws SsoServiceException {

        if (onGetResponseListenerGetTokenInfo != null)
            service.tokeInfo(tokenInfoVo, onGetResponseListenerGetTokenInfo);

        else throw SsoServiceException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Revoke token.
     *
     * @param revokeTokenVo
     * @param onGetResponseListenerRevokeToken A generic listener based on type of the output for receiving response. If the onGetResponseListener is null,
     *                                         InvalidParameterException will be thrown.
     * @return
     * @throws SsoServiceException
     */
    public SsoService revokeToken(RevokeTokenVo revokeTokenVo,
                                  OnGetResponseListenerRevokeToken onGetResponseListenerRevokeToken)
            throws SsoServiceException {

        if (onGetResponseListenerRevokeToken != null)
            service.revokeToken(revokeTokenVo, onGetResponseListenerRevokeToken);

        else throw SsoServiceException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Revoke token.
     *
     * @param handshakeVo
     * @param onGetResponseListenerHandshake A generic listener based on type of the output for receiving response. If the onGetResponseListener is null,
     *                                         InvalidParameterException will be thrown.
     * @return
     * @throws SsoServiceException
     */
    public SsoService handshake(HandshakeVo handshakeVo,
                                OnGetResponseListenerHandshake onGetResponseListenerHandshake)
            throws SsoServiceException {

        if (onGetResponseListenerHandshake != null)
            service.handshake(handshakeVo, onGetResponseListenerHandshake);

        else throw SsoServiceException.invalidParameter(MESSAGE);

        return this;
    }
}
