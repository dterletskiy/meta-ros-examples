inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Publisher application"
AUTHOR = "Terletskyi Dmytro <dmytro_terletskyi@epam.com>"
ROS_AUTHOR = "Terletskyi Dmytro"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

ROS_CN = "frame-publisher"
ROS_BPN = "publisher"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    std-msgs \
    frame-msgs \
    rosidl-adapter \
    rclcpp-components \
    opencv \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rclcpp \
    std-msgs \
    frame-msgs \
    opencv \
"

ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


ROS_BRANCH ?= "branch=frame/publisher"
SRC_URI = "git://github.com/dterletskiy/ros-examples;${ROS_BRANCH};protocol=https"
SRCREV = "bb559e0d66d2495d62d407562cc74fe4f5d75a3c"
S = "${WORKDIR}/git"



ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
