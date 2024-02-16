// Package Declaration
package lupus.core;

// Import Statements
import lupus.Application;
import lupus.graphics.components.Node;
import lupus.graphics.LupusRuntimeWindow;

// File Docstring
/**
 * Provides a layer of abstraction between the Lupus framework and its
 * accessible APIs. This is exposed via the {@code start} method found in the
 * {@link Application} class.
 *
 * @author @MaxineToTheStars <https://github.com/MaxineToTheStars>
 */

// Class Definition
public final class LupusApp {
	// Inner Classes
	/**
	 * Abstraction layer between the {@link LupusRuntimeWindow} and {@link LupusApp}
	 * classes.
	 *
	 * @author @MaxineToTheStars <https://github.com/MaxineToTheStars>
	 */
	public final class LupusWindow {
		// Enums

		// Interfaces

		// Constants

		// Public Variables

		// Private Variables
		private LupusRuntimeWindow _window;

		// Constructor
		/**
		 * Instances a new {@link LupusWindow} object.
		 *
		 * @param window - The {@link LupusRuntimeWindow} component
		 * @return {@link void}
		 */
		protected LupusWindow(final LupusRuntimeWindow window) {
			// Set a reference to the LupusRuntimeWindow
			this._window = window;
		}

		// Public Static Methods
		/**
		 * Set the window title text.
		 *
		 * @param text - The new window title
		 * @return {@link void}
		 */
		public void setWindowTitle(final String text) {
			// Call the setWindowTitle implementation
			this._window.setWindowTitleImpl(text);
		}

		/**
		 * Set the window decorated state.
		 *
		 * @param value - The new decorated state
		 * @implNote This method will also internally invoke {@code setWindowVisibility}
		 *           to hide and then show the window to avoid runtime errors
		 * @return {@link void}
		 */
		public void setDecorated(final boolean value) {
			// Call the setWindowVisibility implementation
			this._window.setWindowVisibilityImpl(false);

			// Call the setDecorated implementation
			this._window.setDecoratedImpl(value);

			// Call the setWindowVisibility implementation
			this._window.setWindowVisibilityImpl(true);
		}

		/**
		 * Set the window visibility state.
		 *
		 * @param value - The new window visibility state
		 * @return {@link void}
		 */
		public void setWindowVisibility(final boolean value) {
			// Call the setWindowVisibility implementation
			this._window.setWindowVisibilityImpl(value);
		}

		/**
		 * Add a given component to the UI tree.
		 *
		 * @param component - The component to add
		 * @return {@link void}
		 */
		public void addComponent(final Node component) {
			// Call the addComponent implementation
			this._window.addComponentImpl(component);
		}

		// Public Inherited Methods

		// Private Static Methods

		// Private Inherited Methods
	}

	// Enums

	// Interfaces

	// Constants

	// Public Variables
	public LupusWindow window;

	// Private Variables

	// Constructor

	// Public Static Methods

	// Public Inherited Methods
	/**
	 * Registers the {@link LupusRuntimeWindow} with the {@link LupusWindow} class.
	 *
	 * @param window - The {@link LupusRuntimeWindow} component
	 * @return {@link void}
	 */
	public void registerWindowComponent(final LupusRuntimeWindow window) {
		// Instance and set
		this.window = new LupusWindow(window);
	}

	// Private Static Methods

	// Private Inherited Methods
}
