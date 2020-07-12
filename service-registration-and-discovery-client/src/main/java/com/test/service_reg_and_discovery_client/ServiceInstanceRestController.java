//package com.test.service_reg_and_discovery_client;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
///**
// * 
// * Now that you have started a service registry, you can stand up a client that
// * both registers itself with the registry and uses the Spring Cloud
// * DiscoveryClient abstraction to interrogate the registry for its own host and
// * port.
// * 
// * The @EnableDiscoveryClient activates the Netflix Eureka DiscoveryClient
// * implementation. (There are other implementations for other service
// * registries, such as Hashicorp’s Consul or Apache Zookeeper).
// * 
// * @author User
// *
// */
//public class ServiceInstanceRestController {
//
//	@Autowired
//	private DiscoveryClient discoveryClient;
//
//	@RequestMapping("/service-instances/{applicationName}")
//	public List<ServiceInstance> serviceInstanceByApplicationName(@PathVariable String applicationName) {
//		return this.discoveryClient.getInstances(applicationName);
//	}
//}
