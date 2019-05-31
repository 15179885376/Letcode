#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time    : 2019/5/31 0031 15:30
# @Author  : Zzy
# @Site    : 
# @File    : Mao_pao_sort.py
# @Software: PyCharm

#每一次比较将数组中最大的值靠边，需计算数据长度减1.
def text(a):
    for i in range(len(a)-1):
        for j in range(len(a)-i-1):
            if(a[j]>a[j+1]):
                a[j],a[j+1]=a[j+1],a[j]
    return a

if __name__ == '__main__':
    a=[2,3,1,5,23,23,1,5,7]
    print(text(a))