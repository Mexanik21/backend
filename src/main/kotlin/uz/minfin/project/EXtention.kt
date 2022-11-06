package uz.minfin.project

fun getFileExtention(fileName: String): String? {
    val dot = fileName.lastIndexOf(".")
    if (dot > 0 && dot <= fileName.length-2){
        return fileName.substring(dot+1)
    }
    return null
}