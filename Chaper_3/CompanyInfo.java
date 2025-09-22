import javax.swing.JOptionPane;

class CompanyInfo {

    public static void main(String[] args) {
        String companyName = "Smart Electronics";
        JOptionPane.showMessageDialog(
            null,
            companyName + "\n" + displayHours()
        );
    }

    public static String displayHours() {
        return "Monday - Friday  8 am to 6 pm\n"
             + "Saturday         8 am to noon\n"
             + "Sunday           closed";
    }
}
