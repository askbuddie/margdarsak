
# PHP Roadmap

## Let's start to learn the PHP?

PHP is a general-purpose scripting language widely used as a server-side language for creating dynamic web pages. Though its reputation is mixed, PHP is still extremely popular and is used in over 75% of all websites where the server-side programming language is known.

### Features of php

- PHP Performs Calculations
- PHP Collects User Information
- PHP Interacts With MySQL Databases
- PHP and GD Library Create Graphics
- PHP Works With Cookies

## PHP Environment Setup

Install PHP by following the steps below. Note that there are several ways to configure Apache and PHP, but this is possibly the quickest method.

#### Step 1: Download the PHP files
You’ll need the PHP Windows installer. There are a number of versions of PHP available. Make sure you get the latest PHP 8 x64 Thread Safe ZIP package from [https://www.php.net/downloads.php](https://www.php.net/downloads.php).

#### Step 2: Extract the files
Create a new `php` folder in the root of your `C:\ drive` and extract the contents of the ZIP into it.

PHP can be installed anywhere on your system, but you’ll need to change the paths referenced below if `C:\php` isn’t used.

#### Step 3: Configure php.ini
PHP’s configuration file is named php.ini. This doesn’t exist initially, so copy `C:\php\php.ini-development` to `C:\php\php.ini`. This default configuration provides a development setup which reports all PHP errors and warnings.

There are several lines you may need to change in a text editor (use search to find the current value). In most cases, you’ll need to remove a leading semicolon (;) to uncomment a setting.

First, enable any required extensions. This will depend on the libraries you want to use, but the following extensions should be suitable for most applications:

>`extension=curl`
`extension=gd`
`extension=mbstring`
`extension=pdo_mysql`

If you want to send emails using PHP’s mail() function, enter the details of an SMTP server in the [mail function] section (your ISP’s server should be suitable):

>`[mail function]
; For Win32 only.
; http://php.net/smtp
SMTP = mail.myisp.com
; http://php.net/smtp-port
smtp_port = 25
; For Win32 only.
; http://php.net/sendmail-from
sendmail_from = my@emailaddress.com`
#### Step 4: Add `C:\php`to the path environment variable
To ensure Windows can find the PHP executable, you need to change the PATH environment variable. Click the Windows Start button and type “environment”, then click Edit the system environment variables. Select the Advanced tab, and click the Environment Variables button.

Scroll down the System variables list and click Path followed by the Edit button. Click New and add C:\php:

PHP path environment variable

Note that older editions of Windows have a single text box where each path is separated by a semi-colon (;).

Click OK until you’re out. You shouldn’t need to reboot, but you may need to close and restart any cmd terminals you have open.

#### Step 5: Configure PHP as an Apache module
Ensure Apache isn’t running and open its `C:\Apache24\conf\httpd.conf` configuration file in a text editor. Add the following lines to the bottom of the file to set PHP as an Apache module (change the file locations if necessary):

>`# PHP8 module
PHPIniDir "C:/php"
LoadModule php_module "C:/php/php8apache2_4.dll"
AddType application/x-httpd-php .php`
Optionally, change the DirectoryIndex setting to load index.php instead of index.html when it can be found. The initial setting is:

<IfModule dir_module>
    DirectoryIndex index.html
</IfModule>
Change it to:

<IfModule dir_module>
    DirectoryIndex index.php index.html
</IfModule>
Save httpd.conf and test the updates from a cmd command line:

cd C:\Apache24\bin
httpd -t
Syntax OK should appear … unless you have errors in your configuration.

If all went well, restart Apache with httpd.

Step 6: Test a PHP file
Create a new file named index.php in Apache’s web page root folder at C:\Apache24\htdocs and add the following PHP code:

<?php
phpinfo();
?>
Open a web browser and enter your server address: http://localhost/. A “PHP version” page will appear showing the various PHP and Apache configuration settings.

You can now create PHP sites and applications in any sub-folder of `C:\Apache24\htdocs`. If you need to work on multiple projects, consider defining Apache Virtual Hosts so you can run separate codebases on different localhost domains or ports.

### Learning  PHP 

* Syntax
* PHP comments
* PHP Comments
* PHP Variables
* PHP Echo/Print
* PHP Data Types
* PHP Strings
* PHP Numbers
* PHP Math
* PHP Constants
* PHP Operators
* PHP IF.. ELSE.. ELSE IF
* PHP Switch
* PHP Loops
* PHP Functions
* PHP Arrays
* PHP Superglobals
* PHP - Web Concepts
* PHP - GET & POST
* PHP - File Inclusion
* PHP - Files & I/O
* PHP - Cookies
* PHP - Sessions
* PHP - Sending Emails
* PHP - File Uploading
* PHP - Coding Standard
### Advanced PHP
* PHP - Predefined Variables
* PHP - Regular Expression
* PHP - Error Handling
* PHP - Bugs Debugging
* PHP - Date & Time
* PHP & MySQL
* PHP & AJAX
* PHP & XML
* PHP - Object Oriented
* PHP - For C Developers
* PHP - For PERL Developers
### PHP Form Examples
* PHP - Form Introduction
* PHP - Validation Example
* PHP - Complete Form
### PHP login Examples
* PHP - Login Example
* PHP - Facebook Login
* PHP - Paypal Integration
* PHP - MySQL Login
### PHP AJAX Examples
* PHP - AJAX Search
* PHP - AJAX XML Parser
* PHP - AJAX Auto Complete Search
* PHP - AJAX RSS Feed Example
### PHP XML Example
* PHP - XML Introduction
* PHP - Simple XML
* PHP - Simple XML GET
* PHP - SAX Parser Example
* PHP - DOM Parser Example
### PHP Frame Works
* PHP - Frame Works
* PHP - Core PHP vs Frame Works
### PHP Design Patterns
* PHP - Design Patterns
### PHP Function Reference
* PHP - Built-In Functions

