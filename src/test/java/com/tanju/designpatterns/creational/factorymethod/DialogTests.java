package com.tanju.designpatterns.creational.factorymethod;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DialogTests {

    @Test
    public void testWindowsButtonCreation() {
        Dialog dialog = new WindowsDialog();
        assertThat(dialog).isNotNull();
        assertThat(dialog).isInstanceOf(WindowsDialog.class);
        assertThat(dialog.render()).isEqualTo("Windows being rendered");
    }

    @Test
    public void testMacButtonCreation() {
        Dialog dialog = new MacDialog();
        assertThat(dialog).isNotNull();
        assertThat(dialog).isInstanceOf(MacDialog.class);
        assertThat(dialog.render()).isEqualTo("Mac being rendered");
    }
}
