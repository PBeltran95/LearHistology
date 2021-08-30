package ar.com.learnhistology.learnhistology.view

import ar.com.learnhistology.learnhistology.data.models.CategoryModel

interface OnclickListener {
    fun onClick(categoryModel: CategoryModel)
}
