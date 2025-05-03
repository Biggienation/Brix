import com.java24.brix.service.Calculator;
import com.java24.brix.serviceprovider.FunnyCalculator;
import com.java24.brix.serviceprovider.NormalCalculator;

module com.java.brix.serviceprovider {
    requires com.java.brix.service;
    provides Calculator with FunnyCalculator, NormalCalculator;
}