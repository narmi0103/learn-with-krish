public class StorageZonesFactory {
    public StorageZones getZone(String zoneType) {
        StorageZones storageZones = null;
        if ("dangerZone".equals(zoneType)){
            storageZones = new DangerZone();
        }
        else if ("freezeZone".equals(zoneType)){
            storageZones = new FreezeZone();
        }
        else if ("darkZone".equals(zoneType)){
            storageZones = new DarkZone();
        }
        else if ("normalZone".equals(zoneType)){
            storageZones = new NormalZone();
        }
        return storageZones;
    }
}
