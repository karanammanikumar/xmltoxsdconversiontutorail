<?xml version="1.0"?> 
<!DOCTYPE stylesheet [<!ENTITY nbsp "<xsl:text disable-output-escaping='yes'>&amp;nbsp;</xsl:text>">]>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
<xsl:output method="html" indent="yes" encoding="utf-8" doctype-public="-//W3C//DTD HTML 4.01 Transitional//EN"/>
<xsl:template match="/">
<html>
<head>
      <title>Sample xml transformation</title>
</head>
<body>
      <xsl:for-each select="/letter">
        <div><div><xsl:value-of select="./title"/></div></div>
        <div><xsl:value-of select="./salutation" /></div>
        <div><xsl:value-of select="./text" /></div>
        <div><xsl:value-of select="./greetings" /></div>
        <div><xsl:value-of select="./signature" /></div>
        <div><xsl:value-of select="./address" /></div>
      </xsl:for-each>
</body>
</html>
</xsl:template>
</xsl:stylesheet>