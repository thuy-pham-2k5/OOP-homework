public class MainComputer {
    public static void main(String[] args) {
        Computer hp = new Computer("Hewlett-Packard", 2199.4, 14);
        Computer lenovo = new Computer("Lenovo", 3400.2, 7);
        Computer acer = new Computer("Acer", 5598.9, 32);

        ManagerComputer managerComputer = new ManagerComputer();
        managerComputer.addComputerToListComps(hp);
        managerComputer.addComputerToListComps(lenovo);
        managerComputer.addComputerToListComps(acer);

        managerComputer.displaylistComp();

        System.out.println("Gia cua san pham ban can tim la: " + managerComputer.findPriceWithCompName("lenovo"));

        if (managerComputer.removeCompWithCompName("lenovo")) {
            System.out.println("Da xoa thanh cong.");
            System.out.println("Danh sach san pham moi la: ");
            managerComputer.displaylistComp();
        }
    }
}
