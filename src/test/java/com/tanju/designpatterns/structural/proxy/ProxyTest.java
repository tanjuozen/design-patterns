package com.tanju.designpatterns.structural.proxy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

public class ProxyTest {

    @Test
    public void securityProxyTest() {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());

        assertThat(service.getTimeline("test")).contains("timeline");
    }

    @Test
    public void securityProxyTestFiltered() {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
        try {
            service.postToTimeline("test", "test");
            fail("Should have thrown exception");
        } catch (Exception e) {
            assertThat(e.getMessage()).contains("Posts are currently not allowed");
        }
    }
}