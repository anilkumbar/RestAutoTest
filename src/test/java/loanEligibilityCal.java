import com.sun.jdi.PathSearchingVirtualMachine;

public class loanEligibilityCal {

    public static void main(String[] args) {

        String empType = "Salaried";
        int age = 40;
        int salary = 3000;
        int loanTeram = 25;
        if (empType.equals("Salaried") || empType.equals("self-employed")) {
            if ((empType.equals("Salaried") && salary >= 120000) || (empType.equals("self-employed") && salary >= 200000)) {
                if (age >= 0 && salary >= 0 && loanTeram >= 0) {
                    if (age >= 21 && age <= 58) {
                        if (loanTeram >= 1 && loanTeram <= 30) {
                            if ((age + loanTeram) <= 58) {
                                System.out.println("  Eligibale");
                            }
                        } else {
                            System.out.println(" Not Eligibale");
                        }
                    } else {
                        System.out.println("Not Eligibale");
                    }
                }
            } else {
                System.out.println("Not Eligibale");
            }
        }
        else{
                System.out.println("Not Eligibale");
            }
        }
}

