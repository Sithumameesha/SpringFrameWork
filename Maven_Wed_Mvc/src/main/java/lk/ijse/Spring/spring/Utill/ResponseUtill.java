package lk.ijse.Spring.spring.Utill;

public class ResponseUtill {
    private String state;
    private String message;
    private Object data;

    public ResponseUtill() {
    }

    public ResponseUtill(String state, String message, Object data) {
        this.state = state;
        this.message = message;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "ResponseUtill{" +
                "state='" + state + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
