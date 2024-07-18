DESCRIPTION = "C++ library to parse and emit YAML"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"



BRANCH = "branch=master"
SRC_URI = "gitsm://github.com/biojppm/rapidyaml.git;${BRANCH};protocol=https"
SRCREV = "837255cfc4c62e1abf8b19c6f6068cd9246f125f"
# SRCREV = "${AUTOREV}"

PV = "0.1+git${SRCPV}"
S = "${WORKDIR}/git"



DEPENDS = "cmake"

inherit cmake
