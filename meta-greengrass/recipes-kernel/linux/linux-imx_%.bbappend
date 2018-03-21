do_patch_defconfig () {
    cat >> ${S}/arch/arm/configs/imx_v7_defconfig << EOM

# GreenGrass
CONFIG_POSIX_MQUEUE=y
CONFIG_OF_OVERLAY=y
CONFIG_OVERLAY_FS=y
CONFIG_HAVE_ARCH_SECCOMP_FILTER=y
CONFIG_SECCOMP_FILTER=y
CONFIG_SECCOMP=y
CONFIG_DEVPTS_MULTIPLE_INSTANCES=y

# GreenGrass – Namespace
CONFIG_MULTIUSER=y
CONFIG_NAMESPACES=y
CONFIG_IPC_NS=y
CONFIG_NET_NS=y
CONFIG_UTS_NS=y
CONFIG_USER_NS=y
CONFIG_PID_NS=y

# GreenGrass – CGROUP
CONFIG_CGROUPS=y
CONFIG_MEMCG=y
CONFIG_CGROUP_FREEZER=y
CONFIG_CGROUP_DEVICE=y
CONFIG_CGROUP_PIDS=y

EOM
}

do_patch_append () {
    bb.build.exec_func('do_patch_defconfig', d)
}