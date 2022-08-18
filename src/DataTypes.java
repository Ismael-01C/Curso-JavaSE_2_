public class DataTypes {
    public static void main(String[] args) {

        //Tipo de dato entero
        int n = 1234567890;
        //Tipo de dato long
        long nL = 123456789012L;
        //para diferenciar el tipo de dato int, se le agrega la L de long al final

        //Tipo de dato Decimal
        //calculos matematicos con mayor presicion
        Double nD = 123.1412;
        //calculos matematicos con datos reducios
        float nF = 123.1412F;
        //para diferenciar el tipo de dato Double, se le agrega la F de float al final

        //La sentencia var declara una variable, opcionalmente inicializándola con un valor.

        var salary = 1000; //int(tipo de dato entero)
        //pension 3%
        var pesion = salary*0.03; //double
        var totalSalary = salary - pesion;
        System.out.println(salary);
        System.out.println(pesion);
        System.out.println(totalSalary);

        var employeeName = "Ismael Carreño";
        System.out.println("EMPLOYEE: " + employeeName + " SALARY: " + totalSalary);
    }
}
