package com.itesoft.pm.rest;

import org.apache.log4j.Logger;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import com.itesoft.pm.rest.config.ConfigParser;
import com.itesoft.pm.rest.listener.PMApplicationEventListener;
import com.itesoft.pm.rest.listener.PMRequestEventListener;

public class PMRestServices extends ResourceConfig {

  private final static Logger _LOGGER = Logger
      .getLogger(PMRestServices.class.getName());
  private final static ConfigParser _CONFIG = ConfigParser.getInstance();

  public PMRestServices() {

    register(org.glassfish.jersey.jackson.JacksonFeature.class);
    setApplicationName("PMServices");
    property(ServerProperties.MOXY_JSON_FEATURE_DISABLE, true);
    property(ServerProperties.WADL_FEATURE_DISABLE, true);

    packages("com.itesoft.pm.rest");

    register(PMApplicationEventListener.class);
    register(PMRequestEventListener.class);

  }

}
