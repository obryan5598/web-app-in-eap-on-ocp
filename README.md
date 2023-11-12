# WEB APP DEPLOYED ON EAP ON OCP

Current repo shows how to deploy a web app using S2I deployment mode.

Useful commands:
```
oc new-project eap-ocp

oc import-image jboss-eap-7/eap74-openjdk17-runtime-openshift-rhel8 --from=registry.redhat.io/jboss-eap-7/eap74-openjdk17-runtime-openshift-rhel8 --confirm --namespace eap-ocp

```


