package com.tanju.designpatterns.creational.abstractfactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class WidgetFactoryTests {

    @Test
    public void testMacWidgetFactory() {
        WidgetFactory factory = MacWidgetFactory.getInstance();
        ScrollBar scrollBar = factory.createScrollBar();
        Window window = factory.createWindow();

        assertThat(scrollBar).isNotNull();
        assertThat(scrollBar).isInstanceOf(MacScrollBar.class);
        assertThat(scrollBar.getStyle()).contains("MAC");

        assertThat(window).isNotNull();
        assertThat(window).isInstanceOf(MacWindow.class);
        assertThat(window.getTitle()).contains("MAC");
    }

    @Test
    public void testWindowsWidgetFactory() {
        WidgetFactory factory = WindowsWidgetFactory.getInstance();
        ScrollBar scrollBar = factory.createScrollBar();
        Window window = factory.createWindow();

        assertThat(scrollBar).isNotNull();
        assertThat(scrollBar).isInstanceOf(WindowsScrollBar.class);
        assertThat(scrollBar.getStyle()).contains("Windows");

        assertThat(window).isNotNull();
        assertThat(window).isInstanceOf(WindowsWindow.class);
        assertThat(window.getTitle()).contains("Windows");
    }

    @Test
    public void testLinuxWidgetFactory() {
        WidgetFactory factory = LinuxWidgetFactory.getInstance();
        ScrollBar scrollBar = factory.createScrollBar();
        Window window = factory.createWindow();

        assertThat(scrollBar).isNotNull();
        assertThat(scrollBar).isInstanceOf(LinuxScrollBar.class);
        assertThat(scrollBar.getStyle()).contains("Linux");

        assertThat(window).isNotNull();
        assertThat(window).isInstanceOf(LinuxWindow.class);
        assertThat(window.getTitle()).contains("Linux");
    }
}
