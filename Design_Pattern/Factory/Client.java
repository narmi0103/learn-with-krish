public class Client {
    public static void main(String[] args) {
        StorageZonesFactory storageZonesFactory = new StorageZonesFactory();
        StorageZones storageZones = null;
        String findMedicine = null;
        
        storageZones = storageZonesFactory.getZone("dangerZone");

        System.out.println("Storage Zone Type: " + storageZones.getClass().getName());
           findMedicine = storageZones.medicineType();
           System.out.println("DangerZone stores: " + findMedicine);
           System.out.println();

        storageZones = storageZonesFactory.getZone("freezeZone");

        System.out.println("Storage Zone Type: " + storageZones.getClass().getName());
            findMedicine = storageZones.medicineType();
            System.out.println("FreezeZone stores: " + findMedicine);
            System.out.println();

        storageZones = storageZonesFactory.getZone("darkZone");

        System.out.println("Storage Zone Type: " + storageZones.getClass().getName());
            findMedicine = storageZones.medicineType();
            System.out.println("DarkZone stores: " + findMedicine);
            System.out.println();

        storageZones = storageZonesFactory.getZone("normalZone");

        System.out.println("Storage Zone Type: " + storageZones.getClass().getName());
            findMedicine = storageZones.medicineType();
            System.out.println("NormalZone stores: " + findMedicine);
            
    }
}
