DESCRIPTION = "Client library for OpenStack Object Storage API"
HOMEPAGE = "https://github.com/openstack/python-swiftclient"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

PR = "r0"
SRCNAME = "swiftclient"

SRC_URI = "git://github.com/openstack/python-swiftclient.git;branch=master"

PV = "3.6.0+git${SRCPV}"
SRCREV = "1cf074f4da62b7a42f88aef3c8571e7b6e850823"
S = "${WORKDIR}/git"

inherit setuptools python-dir

do_install_append() {
    cp -r tests ${D}/${PYTHON_SITEPACKAGES_DIR}/${SRCNAME}/
}

DEPENDS += " \
        python-pip \
        python-pbr-native \
        "

# Satisfy setup.py 'setup_requires'
DEPENDS += " \
        python-pbr-native \
        "

RDEPENDS_${PN} += " \
        python-simplejson \
        python-pbr \
        "
