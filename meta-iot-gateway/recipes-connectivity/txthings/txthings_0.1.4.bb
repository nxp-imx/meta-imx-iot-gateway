SUMMARY = "Python CoAP library for Twisted framework"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/mwasilak/${PN}.git"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit setuptools

RDEPENDS_${PN} = "\
    python-twisted \
    python-ipaddress \
"

