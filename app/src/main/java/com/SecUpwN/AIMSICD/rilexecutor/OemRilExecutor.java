package com.SecUpwN.AIMSICD.rilexecutor;

import android.os.Message;

public interface OemRilExecutor {

    public DetectResult detect();

    public void start();

    public void stop();

    /**
     * Invokes RIL_REQUEST_OEM_HOOK_RAW.
     *
     * @param data     The data for the request.
     * @param response <strong>On success</strong>,
     *                 (byte[])(((AsyncResult)response.obj).result)
     *                 <strong>On failure</strong>,
     *                 (((RawResult)response.obj).result) == null and
     *                 (((RawResult)response.obj).exception) being an instance of
     *                 com.android.internal.telephony.gsm.CommandException
     * @see #invokeOemRilRequestRaw(byte[], android.os.Message)
     */
    public void invokeOemRilRequestRaw(byte data[], Message response);

    /**
     * Invokes RIL_REQUEST_OEM_HOOK_STRING
     *
     * @param strings  The data for the request.
     * @param response <strong>On success</strong>,
     *                 (byte[])(((AsyncResult)response.obj).result)
     *                 <strong>On failure</strong>,
     *                 (((RawResult)response.obj).result) == null and
     *                 (((RawResult)response.obj).exception) being an instance of
     *                 com.android.internal.telephony.gsm.CommandException
     * @see #invokeOemRilRequestStrings(String[], android.os.Message)
     */
    public void invokeOemRilRequestStrings(String[] strings, Message response);

}
