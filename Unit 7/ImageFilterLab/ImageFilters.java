
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageFilters {

    public static void main(String[] args) {
        try {
            // Load an image file
            BufferedImage image = loadFile("images/landscape.jpg");

            // apply a filter
            cyberPunk(image);

            // Save the edited file to desired location
            saveFile("images/edited-landscape.jpg", image);

            // to-do: create 9 more filters using the invertColors as a starting point
            // note you might need to run the filters separately to avoid altering the image multiple times
            // to-do: save all changes as individual files using saveFile()
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    // helper methods
    // This method searches the folder path to the target image and returns a BufferedImage object
    // using the data from the file
    public static BufferedImage loadFile(String pathToImage) throws IOException {
        // Load an image file
        File inputFile = new File(pathToImage);
        BufferedImage image = ImageIO.read(inputFile);
        return image;

    }

    // This method creates a new JPG file at the target save location, and copies the data from the
    // BufferedImage object to the file.
    public static void saveFile(String saveLocation, BufferedImage image) throws IOException {
        // Save the edited image
        File outputFile = new File(saveLocation);
        outputFile.createNewFile();
        ImageIO.write(image, "jpg", outputFile);
        System.out.println("Image color changed and saved successfully!");
    }

    // filter methods
    public static void blackAndWhite(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel, true);
                int average = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
                color = new Color(average, average, average);
                image.setRGB(x, y, color.getRGB());
            }

        }
    }

    public static void sepia(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                double red;
                double blue;
                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel, true);
                int L = (int) (0.3 * color.getRed() + 0.59 * color.getGreen() + 0.11 * color.getBlue());

                if (0 <= color.getRed() && color.getRed() <= 62) {
                    red = 1.1 * L;
                } else if (63 <= color.getRed() && color.getRed() <= 192) {
                    red = 1.15 * L;
                } else {
                    red = 1.07 * L;
                }

                if (0 <= color.getBlue() && color.getBlue() <= 62) {
                    blue = 0.9 * L;
                } else if (62 <= color.getBlue() && color.getBlue() <= 192) {
                    blue = 0.85 * L;
                } else {
                    blue = 0.93 * L;
                }

                if (red > 255) {
                    red = 255;
                }

                if (blue > 255) {
                    blue = 255;
                }
                color = new Color((int) red, L, (int) blue);
                image.setRGB(x, y, color.getRGB());
            }
        }
    }

    public static void valencia(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel, true);
                color = new Color((int) ((color.getRed() + 15) * valenciaDetermineWeight(color.getRed())),
                        (int) ((color.getGreen() + 15) * valenciaDetermineWeight(color.getGreen())),
                        (int) (color.getBlue() * valenciaDetermineWeight(color.getBlue())));
                image.setRGB(x, y, color.getRGB());
            }
        }
    }

    public static double valenciaDetermineWeight(int value) {
        if (value >= 0 && value <= 62) {
            return 1.1;
        } else if (value >= 63 && value <= 192) {
            return 1;
        } else {
            return 0.9;
        }
    }

    public static void mirror(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width / 2; x++) {
                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel, true);
                image.setRGB(x, y, color.getRGB());
                image.setRGB(width - x - 1, y, color.getRGB());
            }
        }
    }

    public static void contrast(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel, true);
                color = new Color(contrastHelp(color.getRed()), contrastHelp(color.getGreen()), contrastHelp(color.getBlue()));
                image.setRGB(x, y, color.getRGB());
            }
        }
    }

    public static int contrastHelp(int value) {
        if (value >= 193) {
            value = (int) (value + value * 0.3);
            if (value > 255) {
                value = 255;
            }
        } else if (value <= 62) {
            value = (int) (value * 0.3);
        }
        return value;
    }

    public static void warm(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel, true);
                int red = (int) (color.getRed() * 1.2);
                if (red > 255) {
                    red = 255;
                }
                color = new Color(red, color.getGreen(), color.getBlue());
                image.setRGB(x, y, color.getRGB());
            }
        }
    }

    public static void cool(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel, true);
                int red = (int) (color.getRed() * 0.9);
                color = new Color(red, color.getGreen(), color.getBlue());
                image.setRGB(x, y, color.getRGB());
            }
        }
    }

    public static void swap(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel, true);
                color = new Color(color.getRed(), color.getBlue(), color.getGreen());
                image.setRGB(x, y, color.getRGB());
            }
        }
    }

    public static void cyberPunk(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel, true);
                int red = (int) (color.getRed() * 0.9);
                if (red > 255) {
                    red = 255;
                }
                int green = (int) (color.getGreen() * 0.4);
                int blue = (int) (color.getBlue() * 1.5);
                if (blue > 255) {
                    blue = 255;
                }
                if (color.getRed() + color.getBlue() + color.getGreen() < 35) {
                    red = 0;
                    green = 0;
                    blue = 0;
                }
                color = new Color((int) (red * 0.9), (int) (green * 0.9), (int) (blue * 0.9));
                image.setRGB(x, y, color.getRGB());
            }
        }
    }

    // invert colors
    public static void invertColors(BufferedImage image) {
        // grab the dimensions
        int width = image.getWidth();
        int height = image.getHeight();

        // loop across the height and width of the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // grab the RGB color values of an individual pixel
                int pixel = image.getRGB(x, y);

                // create a Color obj using the RGB values of the pixel as a starting point 
                Color color = new Color(pixel, true);

                // modify the RGB values of the color 
                // the code below inverts colors 
                color = new Color(255 - color.getRed(), 255 - color.getGreen(),
                        255 - color.getBlue());

                // update the pixel's color to the new color 
                // this code directly modifies the BufferedImage
                image.setRGB(x, y, color.getRGB());
            }
        }
    }

    public static void blank(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel, true);
                //do stuff
                color = new Color(color.getRed(), color.getGreen(), color.getBlue());
                image.setRGB(x, y, color.getRGB());
            }
        }
    }

}
