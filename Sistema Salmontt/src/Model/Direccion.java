package Model;

public class Direccion {
    private String calle;
    private String ciudad;
    private String region;
    private String codigoPostal;


    public Direccion() {
        this.calle = "Sin calle";
        this.ciudad = "Sin ciudad";
        this.region = "Sin región";
        this.codigoPostal = "000000000";
    }


    public Direccion(String calle, String ciudad, String region, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
        this.codigoPostal = codigoPostal;
    }


    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }


    @Override
    public String toString() {
        return calle + ", " + ciudad + ", " + region + " (" + codigoPostal + ")";
    }
}


