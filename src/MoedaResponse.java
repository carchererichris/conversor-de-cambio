import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MoedaResponse {
    private String base_code;
    private ArrayList<ConversionRate> conversion_rates;

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public ArrayList<ConversionRate> getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(ArrayList<ConversionRate> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }
}
