package site.timely.http;

import site.timely.exception.ExceptionBody;
import site.timely.exception.HttpExceptionBody;

/**
 * 网络请求结果
 *
 * @author timely-rain
 * @verion 1.0.0, 2017/9/29
 * @since 1.8
 */
public class HttpResult {

    /**
     * Http应答
     */
    private HttpExceptionBody notify;

    /**
     * 是否成功
     */
    private boolean isSuccess;

    /**
     * 数据
     */
    private String data;

    /**
     * 补充数据
     */
    private String attach;

    public HttpResult(boolean isSuccess, ExceptionBody notify) {
        this.isSuccess = isSuccess;
        this.notify = new HttpExceptionBody();
        this.notify.setAdapter(notify);
    }

    public HttpResult(boolean isSuccess, HttpExceptionBody notify) {
        this.isSuccess = isSuccess;
        this.notify = notify;
    }

    public HttpExceptionBody getNotify() {
        return notify;
    }

    public void setNotify(HttpExceptionBody notify) {
        this.notify = notify;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }
}
