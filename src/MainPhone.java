public class MainPhone {
    public static void main(String[] args) {
        Phone iphone = new Phone("Iphone", 3.44, 5);
        Phone samsung = new Phone("Samsung", 8.9, 3);
        Phone xiaomi = new Phone("Xiaomi", 3.2, 10);
        ManagerPhone managerPhone = new ManagerPhone();
        managerPhone.addPhoneToListPhones(iphone);
        managerPhone.addPhoneToListPhones(samsung);
        managerPhone.addPhoneToListPhones(samsung);

//        managerPhone.displayListPhone();

//        System.out.println(managerPhone.findPricePhoneWithPhoneName("xiaomi"));

//        managerPhone.displayListPhone();
//        if (managerPhone.removePhoneWithPhoneName("xiaomi")) {
//            System.out.println("Da xoa thanh cong.");
//            System.out.println("Danh sach moi la: ");
//            managerPhone.displayListPhone();
//        }

    }
}
