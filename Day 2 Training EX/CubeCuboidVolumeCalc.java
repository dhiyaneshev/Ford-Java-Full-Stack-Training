public class CubeCuboidVolumeCalc {
    public static void main(String[] args) {
        ThreeDimensionShape shape1 = new ThreeDimensionShape(5, 6, 7);
        ThreeDimensionShape shape2 = new ThreeDimensionShape();
        ThreeDimensionShape shape3 = new ThreeDimensionShape(8);
        double volume;

        volume = shape1.calculateVolume();
        System.out.println(" Volume of shape1 is " + volume);

        volume = shape2.calculateVolume();
        System.out.println(" Volume of shape2 is " + volume);

        volume = shape3.calculateVolume();
        System.out.println(" Volume of shape3 is " + volume);

    }
}

class ThreeDimensionShape {
    double width, height, depth;
    ThreeDimensionShape (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    ThreeDimensionShape (double l) {
        width = height = depth = l;
    }
    ThreeDimensionShape() {
        width = height = depth = 0.0;
    }

    double calculateVolume() {
        return width * height * depth;
    }
}