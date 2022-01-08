package MedicalShop;

public class Main {

    public static void main(String[] args) {
        MedicineStore medicineStore = new MedicineStore();

        Crocin crocin = new Crocin();
        Chawayanprash chawayanprash = new Chawayanprash();
        Vicks vicks = new Vicks();
        BTrim btrim = new BTrim();
        Azithromycin azithromycin = new Azithromycin();

        medicineStore.add(crocin);
        medicineStore.add(btrim);
        medicineStore.add(chawayanprash);
        medicineStore.add(vicks);
        medicineStore.add(azithromycin);
    }

}
