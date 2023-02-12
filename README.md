# ctr-schemas

Contains the schemas and wsdl file used in the CTR project for the new DGWS interface

## Build

Run `mvn clean package` to create a zip file of the wsdl and schema files in `ctr-schemas` repo. The zip file is located in the `target` folder.

## Upload zip file to Github

When creating a release in Github of this project, the Github action workflow will automatically create a zip file and upload it to the Github packages.

Find it [here](https://github.com/trifork/ctr-schemas/packages/1787197)


