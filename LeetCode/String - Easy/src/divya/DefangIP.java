package divya;

public class DefangIP {
    public String defangIPaddr(String address) {
        String s=address.replace(".","[.]");
        return s;
    }
}
