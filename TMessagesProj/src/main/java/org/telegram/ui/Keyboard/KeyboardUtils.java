package org.telegram.ui.Keyboard;

import android.view.KeyEvent;

public class KeyboardUtils {
    public static boolean isSelectButton(int keycode) {
        switch(keycode) {
            case KeyEvent.KEYCODE_BUTTON_SELECT:
            case KeyEvent.KEYCODE_BUTTON_A:
            case KeyEvent.KEYCODE_ENTER:
            case KeyEvent.KEYCODE_DPAD_CENTER:
            case KeyEvent.KEYCODE_NUMPAD_ENTER:
                return true;
            default:
                return false;
        }
    }
}
