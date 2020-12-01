package immutable;

public class Satellite {
    private CelestialCoordinates destinationCoordinates;
    private String registerIdent;

    public Satellite(CelestialCoordinates destinationCoordinates, String registerIdent) {
        if (registerIdent.isEmpty()) {
            throw new IllegalArgumentException("Register ident must not be empty!");
        }
        this.destinationCoordinates = destinationCoordinates;
        this.registerIdent = registerIdent;
    }

    public void modifyDestination(CelestialCoordinates diff) {
        int newx = destinationCoordinates.getX() + diff.getX();
        int newy = destinationCoordinates.getY() + diff.getY();
        int newz = destinationCoordinates.getZ() + diff.getZ();
        destinationCoordinates= new CelestialCoordinates(newx,newy,newz);
    }

    @Override
    public String toString() {
        return registerIdent+": " + destinationCoordinates;
    }

    public String getRegisterIdent() {
        return registerIdent;
    }
}
