// question no 8 


interface Filterable {
    void applyFilter(String filterType);
    void resetFilter();
}

// Class implementing Filterable for image processing
class ImageProcessor implements Filterable {
    @Override
    public void applyFilter(String filterType) {
        System.out.println("Applying " + filterType + " filter to image.");
    }

    @Override
    public void resetFilter() {
        System.out.println("Resetting image filters.");
    }
}

// Class implementing Filterable for data analysis
class DataAnalyzer implements Filterable {
    @Override
    public void applyFilter(String filterType) {
        System.out.println("Applying " + filterType + " filter to data.");
    }

    @Override
    public void resetFilter() {
        System.out.println("Resetting data filters.");
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        // Using ImageProcessor
        Filterable imgProcessor = new ImageProcessor();
        imgProcessor.applyFilter("Grayscale");
        imgProcessor.resetFilter();

        System.out.println("----------------------------");

        // Using DataAnalyzer
        Filterable dataAnalyzer = new DataAnalyzer();
        dataAnalyzer.applyFilter("Noise Reduction");
        dataAnalyzer.resetFilter();
    }
}
