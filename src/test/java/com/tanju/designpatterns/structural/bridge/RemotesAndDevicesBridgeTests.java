package com.tanju.designpatterns.structural.bridge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemotesAndDevicesBridgeTests {

    @Test
    public void testBasicRemote() {
        Device tv = new TV();
        BasicRemote basicRemote = new BasicRemote(tv);

        basicRemote.power();
        basicRemote.channelUp();
        basicRemote.volumeUp();

        assertThat(tv.isEnabled()).isTrue();
        assertThat(tv.getChannel()).isEqualTo(2);
        assertThat(tv.getVolume()).isEqualTo(10);
    }

    @Test
    public void testAdvancedRemote() {
        Device radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);

        advancedRemote.power();
        advancedRemote.channelDown();
        advancedRemote.volumeDown();
        advancedRemote.mute();

        assertThat(radio.isEnabled()).isTrue();
        assertThat(radio.getChannel()).isEqualTo(0);
        assertThat(radio.getVolume()).isEqualTo(0);
    }
}
