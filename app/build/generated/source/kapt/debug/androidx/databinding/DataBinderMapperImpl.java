package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new net.developermaster.kotlincanivetesuico.DataBinderMapperImpl());
  }
}
