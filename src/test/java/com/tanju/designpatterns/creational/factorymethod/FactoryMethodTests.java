package com.tanju.designpatterns.creational.factorymethod;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactoryMethodTests {

    @Test
    public void testWindowsButtonCreation() {
        Dialog dialog = new WindowsDialog();
        Button button = dialog.createButton();
        assertThat(dialog).isNotNull();
        assertThat(dialog).isInstanceOf(WindowsDialog.class);
        assertThat(dialog.render()).isEqualTo("Windows being rendered");
        assertThat(button).isInstanceOf(WindowsButton.class);
    }

    @Test
    public void testMacButtonCreation() {
        Dialog dialog = new MacDialog();
        Button button = dialog.createButton();
        assertThat(dialog).isNotNull();
        assertThat(dialog).isInstanceOf(MacDialog.class);
        assertThat(dialog.render()).isEqualTo("Mac being rendered");
        assertThat(button).isInstanceOf(MacButton.class);
    }
}
