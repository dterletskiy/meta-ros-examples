inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Subscriber application"
AUTHOR = "Terletskyi Dmytro <dmytro_terletskyi@epam.com>"
ROS_AUTHOR = "Terletskyi Dmytro"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

ROS_CN = "frame-subscriber"
ROS_BPN = "subscriber"

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


ROS_BRANCH ?= "branch=frame/subscriber"
SRC_URI = "git://github.com/dterletskiy/ros-examples;${ROS_BRANCH};protocol=https"
SRCREV = "6b1fb36b3b76d11db5baf968ee0c042574ab0c5d"
S = "${WORKDIR}/git"



ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
