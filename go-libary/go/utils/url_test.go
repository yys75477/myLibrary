/*
# -*- coding: utf-8 -*-
# @Author : joker
# @Time : 2019-07-16 14:45 
# @File : url_test.go
# @Description : 
*/
package utils

import (
	"fmt"
	"path"
	"testing"
)

func TestGetLowerSuffixFromUrl(t *testing.T) {
	// str := "https://pics4.baidu.com/feed/3801213fb80e7bec5381c7dc4b039a3d9b506b62.jpeg?token=f1b76f785e07863fb5ad927b17bc73c0&s=3F68E7170C12E5CA441B03E40300702E"
	filePath := "/Users/joker/Desktop/图片/测试/图片相似度测试/sim_2.png"
	s, _ := GetLowerSuffixFromUrl(filePath)
	fmt.Println(s)
}

func TestGetFileSuffix(t *testing.T) {
	filePath := "/Users/joker/Desktop/图片/测试/图片相似度测试/sim_2.png"
	s:= path.Ext(filePath)
	// if nil != e {
	// 	panic(e)
	// }
	fmt.Println(s)
}
