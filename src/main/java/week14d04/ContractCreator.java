package week14d04;

import java.util.ArrayList;
import java.util.List;

public class ContractCreator {
    private Contract sablon;

    public ContractCreator(String client, List<Integer> monthlyPrices){
        sablon = new Contract(client,monthlyPrices);
    }

    public Contract create(String name){
        Contract result = new Contract(sablon);
        result.setClient(name);
        return result;
    }

    public Contract getSablon() {
        return sablon;
    }

    public static void main(String[] args) {
        ContractCreator cc = new ContractCreator("Jozsi",new ArrayList<>(List.of(
                8000,5000,6600,4400,8800,9000,11000,9800,4600,7800,12000,7700)));
        Contract newContract = cc.create("Geza");
        newContract.setMonthlyPrices(11,3000);
        System.out.println(cc.getSablon());
        System.out.println(newContract);

    }


}
