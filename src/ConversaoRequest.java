public class ConversaoRequest {
    private String baseCode;
    private String targetCode;
    private double valor;

    public ConversaoRequest(String baseCode, String targetCode, double valor) {
        this.baseCode = baseCode;
        this.targetCode = targetCode;
        this.valor = valor;
    }

    public ConversaoRequest() {

    }

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
