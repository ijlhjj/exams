# 指定 cmake 最低版本
cmake_minimum_required(VERSION 3.20)

# 设置项目名称
project(exams)


######## 设置变量

# 使用的 C++ 标准，并要求编译器必须支持此标准
set(CMAKE_CXX_STANDARD 20)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

# 源码目录
set(SOURCE src)
set(TEST tests)

# 指定构建类型以启用调试
set(CMAKE_BUILD_TYPE Debug)


######## 项目编译

# 包含项目头文件
include_directories(include)

# 项目源码编译
aux_source_directory(${SOURCE}/exams/exams1 exams1)
aux_source_directory(${SOURCE}/exams/exams3 exams3)
aux_source_directory(${SOURCE}/exams/exams4 exams4)
aux_source_directory(${TEST}/exams/exams1 test1)
aux_source_directory(${TEST}/exams/exams3 test3)
aux_source_directory(${TEST}/exams/exams4 test4)

# 模块编译
add_library(exams1 ${exams1})
add_library(exams3 ${exams3})
add_library(exams4 ${exams4})

# 生成可执行文件
add_executable(unit_tests ${test1} ${test3} ${test4})

# 模块链接
target_link_libraries(unit_tests
    exams1
    exams3
    exams4
    gtest_main
)


######## 单元测试

# 添加 googletest 项目
add_subdirectory(googletest)

# 启用测试
enable_testing()

# 添加测试单元
add_test(test_all unit_tests)
