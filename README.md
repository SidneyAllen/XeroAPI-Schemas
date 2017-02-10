Xero API XSD Schemas
====================

This repository contains a set of XSD schemas that can be used with the [Xero API](http://api.xero.com). Xero provide [online accounting software](http://www.xero.com/) for businesses. For more information on connecting to the API, see the [Xero Developer Centre](http://developer.xero.com/).

### Download Xero Schema

Add this dependency to your POM.xml

    <dependency>
	  <groupId>com.xero</groupId>
	  <artifactId>xero-accounting-api-schema</artifactId>
	  <version>0.0.1</version>
	</dependency>

You will also add this repository to your POM.xml

     <repository>
      <id>xero-accounting-api-schema-mvn-repo</id>
	  <url>https://raw.github.com/XeroAPI/XeroAPI-Schemas/mvn-repo/</url>
	  <snapshots>
	    <enabled>true</enabled>
	    <updatePolicy>always</updatePolicy>
	  </snapshots>
    </repository>


Generate your own classes
---------
We've added support for maven build automation.  A pom.xml file in the root defines how to generate Java classes from the XSD files in this project.  To generate you Java classes, open your terminal app and change to the directory containing the pom.xml file and run the following command

```bash
mvn clean install 
```

A new *target* directory will be created along with subfolders.  Look in the *generated-source* subfolder for your Java classes.


**Please Note**
These XSD schemas are provided as a guide for the XML that is read/written to the Xero API 'as is' for information purposes only.

Xero does not commit to ensuring these schemas are always kept up to date, but does accept contributions and amendments to ensure they are as accurate as possible.

Status
---------
[![Build Status](https://travis-ci.org/XeroAPI/XeroAPI-Schemas.svg)](https://travis-ci.org/XeroAPI/XeroAPI-Schemas)


Copyright
---------

 Copyright (c) 2010 Xero Limited

 Permission is hereby granted, free of charge, to any person
 obtaining a copy of this software and associated documentation
 files (the "Software"), to deal in the Software without
 restriction, including without limitation the rights to use,
 copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the
 Software is furnished to do so, subject to the following
 conditions:

 The above copyright notice and this permission notice shall be
 included in all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 OTHER DEALINGS IN THE SOFTWARE.


Warranty
--------

 Xero API Schemas

 The Xero API Schemas is provided under the MIT license as described
 above.

 PLEASE NOTE: No warranty is given to the accuracy of the schema
 files. The Xero API team reserve the right to introduce new elements
 to the API request and response messages without warning.

 The schemas are provided for reference purposes for generating
 client-side object models. Considering that the schema files may
 not always match the response from the API, we reccommend that you
 do NOT validate response xml messages using the xml schemas.

 The use of the Xero Developer Platform is bound by the Xero Developer Platform Terms and Conditions,
 see http://developer.xero.com/xero-developer-platform-terms-conditions/ for more information.
