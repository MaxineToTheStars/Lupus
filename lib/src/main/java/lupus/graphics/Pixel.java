// Package Declaration
package lupus.graphics;

// Import Statements
// ----------------------------------------------------------------
import java.awt.Color;
import java.lang.IllegalArgumentException;
// ---

// ---

// ----------------------------------------------------------------

// File Docstring
/**
 * Representation of an onscreen pixel. Stores its color value as {@code RGBA}.
 *
 * @author @MaxineToTheStars <https://github.com/MaxineToTheStars>
 */

// Class Definition
public final class Pixel {
    // Enums

    // Interfaces

    // Constants

    // Public Variables

    // Private Variables
    private Color _pixelValue;

    // Constructor
    /**
     * Instances a new white {@link Pixel} object.
     *
     * @return {@link Pixel} - A new {@link Pixel} of value {@code (255, 255, 255)}
     */
    public Pixel() {
        // Set pixel value to white
        this._pixelValue = new Color(255, 255, 255);
    }

    /**
     * Instances a new {@link Pixel} object with the specified {@link Color} value.
     *
     * @param value - The {@link Pixel} value
     * @return {@link Pixel} - A new {@link Pixel} of the specified {@link Color}
     */
    public Pixel(final Color value) {
        // Set pixel data
        this._pixelValue = value;
    }

    /**
     * Instances a new {@link Pixel} object with the specified channel values.
     *
     * @param red   - The red channel value (0-255)
     * @param green - The green channel value (0-255)
     * @param blue  - The blue channel value (0-255)
     * @throws IllegalArgumentException If {@code red}, {@code green}, or
     *                                  {@code blue} are outside of the range 0 to
     *                                  255, inclusive.
     * @return {@link Pixel} - A new {@link Pixel} of the specified
     *         {@code (Red, Green, Blue)} values
     */
    public Pixel(final int red, final int green, final int blue) throws IllegalArgumentException {
        // Create a new Color object and set it to pixel value
        this._pixelValue = new Color(red, green, blue);
    }

    /**
     * Instances a new {@link Pixel} object with the specified channel and alpha
     * values.
     *
     * @param red   - The red channel value (0-255)
     * @param green - The green channel value (0-255)
     * @param blue  - The blue channel value (0-255)
     * @param alpha - The alpha value (0-255)
     * @throws IllegalArgumentException If {@code red}, {@code green},
     *                                  {@code blue}, or {@code alpha} are outside
     *                                  of the range 0 to
     *                                  255, inclusive.
     * @return {@link Pixel} - A new {@link Pixel} of the specified
     *         {@code (Red, Green, Blue, Alpha)} values
     */
    public Pixel(final int red, final int green, final int blue, final int alpha) throws IllegalArgumentException {
        // Create a new Color object and set it to pixel value
        this._pixelValue = new Color(red, green, blue, alpha);
    }

    // Public Static Methods

    // Public Inherited Methods
    /**
     * Returns the {@link Pixel}'s {@link Color} value.
     *
     * @return {@link Color} - The {@link Pixel} as a {@link Color} value
     */
    public Color getPixelValue() {
        // Return the pixel value
        return this._pixelValue;
    }

    /**
     * Sets a {@link Pixel}'s pixel value to the value specified.
     *
     * @param value - The new pixel value
     * @return {@link void}
     */
    public void setPixelValue(final Color value) {
        // Set the pixel value
        this._pixelValue = value;
    }

    /**
     * Compares two {@link Pixel} objects to see if they are the same.
     *
     * @param pixel - The {@link Pixel} to compare
     * @return {@link boolean} - The specified {@link Pixel} is equal to
     *         {@code this} {@link Pixel}
     */
    public boolean equals(final Pixel pixel) {
        // Check if the current pixel is equal to the specific pixel
        return this.getPixelValue().equals(pixel.getPixelValue());
    }

    // Private Static Methods

    // Private Inherited Methods
}
