package packageModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class ChNameList implements Serializable {

    private static final long serialVersionUID = 1582712832241L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 
    * isNullAble:1
    */
    private String engName;

    /**
    * 
    * isNullAble:1
    */
    private String chName;

    /**
    * 
    * isNullAble:1
    */
    private String imdbNub;

    /**
    * 
    * isNullAble:1,defaultVal:false
    */
    private String isBan;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setEngName(String engName){this.engName = engName;}

    public String getEngName(){return this.engName;}

    public void setChName(String chName){this.chName = chName;}

    public String getChName(){return this.chName;}

    public void setImdbNub(String imdbNub){this.imdbNub = imdbNub;}

    public String getImdbNub(){return this.imdbNub;}

    public void setIsBan(String isBan){this.isBan = isBan;}

    public String getIsBan(){return this.isBan;}
    @Override
    public String toString() {
        return "ChNameList{" +
                "id='" + id + '\'' +
                "engName='" + engName + '\'' +
                "chName='" + chName + '\'' +
                "imdbNub='" + imdbNub + '\'' +
                "isBan='" + isBan + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ChNameList set;

        private ConditionBuilder where;

        public UpdateBuilder set(ChNameList set){
            this.set = set;
            return this;
        }

        public ChNameList getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends ChNameList{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> engNameList;

        public List<String> getEngNameList(){return this.engNameList;}


        private List<String> fuzzyEngName;

        public List<String> getFuzzyEngName(){return this.fuzzyEngName;}

        private List<String> rightFuzzyEngName;

        public List<String> getRightFuzzyEngName(){return this.rightFuzzyEngName;}
        private List<String> chNameList;

        public List<String> getChNameList(){return this.chNameList;}


        private List<String> fuzzyChName;

        public List<String> getFuzzyChName(){return this.fuzzyChName;}

        private List<String> rightFuzzyChName;

        public List<String> getRightFuzzyChName(){return this.rightFuzzyChName;}
        private List<String> imdbNubList;

        public List<String> getImdbNubList(){return this.imdbNubList;}


        private List<String> fuzzyImdbNub;

        public List<String> getFuzzyImdbNub(){return this.fuzzyImdbNub;}

        private List<String> rightFuzzyImdbNub;

        public List<String> getRightFuzzyImdbNub(){return this.rightFuzzyImdbNub;}
        private List<String> isBanList;

        public List<String> getIsBanList(){return this.isBanList;}


        private List<String> fuzzyIsBan;

        public List<String> getFuzzyIsBan(){return this.fuzzyIsBan;}

        private List<String> rightFuzzyIsBan;

        public List<String> getRightFuzzyIsBan(){return this.rightFuzzyIsBan;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder fuzzyEngName (List<String> fuzzyEngName){
            this.fuzzyEngName = fuzzyEngName;
            return this;
        }

        public QueryBuilder fuzzyEngName (String ... fuzzyEngName){
            this.fuzzyEngName = solveNullList(fuzzyEngName);
            return this;
        }

        public QueryBuilder rightFuzzyEngName (List<String> rightFuzzyEngName){
            this.rightFuzzyEngName = rightFuzzyEngName;
            return this;
        }

        public QueryBuilder rightFuzzyEngName (String ... rightFuzzyEngName){
            this.rightFuzzyEngName = solveNullList(rightFuzzyEngName);
            return this;
        }

        public QueryBuilder engName(String engName){
            setEngName(engName);
            return this;
        }

        public QueryBuilder engNameList(String ... engName){
            this.engNameList = solveNullList(engName);
            return this;
        }

        public QueryBuilder engNameList(List<String> engName){
            this.engNameList = engName;
            return this;
        }

        public QueryBuilder fetchEngName(){
            setFetchFields("fetchFields","engName");
            return this;
        }

        public QueryBuilder excludeEngName(){
            setFetchFields("excludeFields","engName");
            return this;
        }

        public QueryBuilder fuzzyChName (List<String> fuzzyChName){
            this.fuzzyChName = fuzzyChName;
            return this;
        }

        public QueryBuilder fuzzyChName (String ... fuzzyChName){
            this.fuzzyChName = solveNullList(fuzzyChName);
            return this;
        }

        public QueryBuilder rightFuzzyChName (List<String> rightFuzzyChName){
            this.rightFuzzyChName = rightFuzzyChName;
            return this;
        }

        public QueryBuilder rightFuzzyChName (String ... rightFuzzyChName){
            this.rightFuzzyChName = solveNullList(rightFuzzyChName);
            return this;
        }

        public QueryBuilder chName(String chName){
            setChName(chName);
            return this;
        }

        public QueryBuilder chNameList(String ... chName){
            this.chNameList = solveNullList(chName);
            return this;
        }

        public QueryBuilder chNameList(List<String> chName){
            this.chNameList = chName;
            return this;
        }

        public QueryBuilder fetchChName(){
            setFetchFields("fetchFields","chName");
            return this;
        }

        public QueryBuilder excludeChName(){
            setFetchFields("excludeFields","chName");
            return this;
        }

        public QueryBuilder fuzzyImdbNub (List<String> fuzzyImdbNub){
            this.fuzzyImdbNub = fuzzyImdbNub;
            return this;
        }

        public QueryBuilder fuzzyImdbNub (String ... fuzzyImdbNub){
            this.fuzzyImdbNub = solveNullList(fuzzyImdbNub);
            return this;
        }

        public QueryBuilder rightFuzzyImdbNub (List<String> rightFuzzyImdbNub){
            this.rightFuzzyImdbNub = rightFuzzyImdbNub;
            return this;
        }

        public QueryBuilder rightFuzzyImdbNub (String ... rightFuzzyImdbNub){
            this.rightFuzzyImdbNub = solveNullList(rightFuzzyImdbNub);
            return this;
        }

        public QueryBuilder imdbNub(String imdbNub){
            setImdbNub(imdbNub);
            return this;
        }

        public QueryBuilder imdbNubList(String ... imdbNub){
            this.imdbNubList = solveNullList(imdbNub);
            return this;
        }

        public QueryBuilder imdbNubList(List<String> imdbNub){
            this.imdbNubList = imdbNub;
            return this;
        }

        public QueryBuilder fetchImdbNub(){
            setFetchFields("fetchFields","imdbNub");
            return this;
        }

        public QueryBuilder excludeImdbNub(){
            setFetchFields("excludeFields","imdbNub");
            return this;
        }

        public QueryBuilder fuzzyIsBan (List<String> fuzzyIsBan){
            this.fuzzyIsBan = fuzzyIsBan;
            return this;
        }

        public QueryBuilder fuzzyIsBan (String ... fuzzyIsBan){
            this.fuzzyIsBan = solveNullList(fuzzyIsBan);
            return this;
        }

        public QueryBuilder rightFuzzyIsBan (List<String> rightFuzzyIsBan){
            this.rightFuzzyIsBan = rightFuzzyIsBan;
            return this;
        }

        public QueryBuilder rightFuzzyIsBan (String ... rightFuzzyIsBan){
            this.rightFuzzyIsBan = solveNullList(rightFuzzyIsBan);
            return this;
        }

        public QueryBuilder isBan(String isBan){
            setIsBan(isBan);
            return this;
        }

        public QueryBuilder isBanList(String ... isBan){
            this.isBanList = solveNullList(isBan);
            return this;
        }

        public QueryBuilder isBanList(List<String> isBan){
            this.isBanList = isBan;
            return this;
        }

        public QueryBuilder fetchIsBan(){
            setFetchFields("fetchFields","isBan");
            return this;
        }

        public QueryBuilder excludeIsBan(){
            setFetchFields("excludeFields","isBan");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public ChNameList build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> engNameList;

        public List<String> getEngNameList(){return this.engNameList;}


        private List<String> fuzzyEngName;

        public List<String> getFuzzyEngName(){return this.fuzzyEngName;}

        private List<String> rightFuzzyEngName;

        public List<String> getRightFuzzyEngName(){return this.rightFuzzyEngName;}
        private List<String> chNameList;

        public List<String> getChNameList(){return this.chNameList;}


        private List<String> fuzzyChName;

        public List<String> getFuzzyChName(){return this.fuzzyChName;}

        private List<String> rightFuzzyChName;

        public List<String> getRightFuzzyChName(){return this.rightFuzzyChName;}
        private List<String> imdbNubList;

        public List<String> getImdbNubList(){return this.imdbNubList;}


        private List<String> fuzzyImdbNub;

        public List<String> getFuzzyImdbNub(){return this.fuzzyImdbNub;}

        private List<String> rightFuzzyImdbNub;

        public List<String> getRightFuzzyImdbNub(){return this.rightFuzzyImdbNub;}
        private List<String> isBanList;

        public List<String> getIsBanList(){return this.isBanList;}


        private List<String> fuzzyIsBan;

        public List<String> getFuzzyIsBan(){return this.fuzzyIsBan;}

        private List<String> rightFuzzyIsBan;

        public List<String> getRightFuzzyIsBan(){return this.rightFuzzyIsBan;}

        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyEngName (List<String> fuzzyEngName){
            this.fuzzyEngName = fuzzyEngName;
            return this;
        }

        public ConditionBuilder fuzzyEngName (String ... fuzzyEngName){
            this.fuzzyEngName = solveNullList(fuzzyEngName);
            return this;
        }

        public ConditionBuilder rightFuzzyEngName (List<String> rightFuzzyEngName){
            this.rightFuzzyEngName = rightFuzzyEngName;
            return this;
        }

        public ConditionBuilder rightFuzzyEngName (String ... rightFuzzyEngName){
            this.rightFuzzyEngName = solveNullList(rightFuzzyEngName);
            return this;
        }

        public ConditionBuilder engNameList(String ... engName){
            this.engNameList = solveNullList(engName);
            return this;
        }

        public ConditionBuilder engNameList(List<String> engName){
            this.engNameList = engName;
            return this;
        }

        public ConditionBuilder fuzzyChName (List<String> fuzzyChName){
            this.fuzzyChName = fuzzyChName;
            return this;
        }

        public ConditionBuilder fuzzyChName (String ... fuzzyChName){
            this.fuzzyChName = solveNullList(fuzzyChName);
            return this;
        }

        public ConditionBuilder rightFuzzyChName (List<String> rightFuzzyChName){
            this.rightFuzzyChName = rightFuzzyChName;
            return this;
        }

        public ConditionBuilder rightFuzzyChName (String ... rightFuzzyChName){
            this.rightFuzzyChName = solveNullList(rightFuzzyChName);
            return this;
        }

        public ConditionBuilder chNameList(String ... chName){
            this.chNameList = solveNullList(chName);
            return this;
        }

        public ConditionBuilder chNameList(List<String> chName){
            this.chNameList = chName;
            return this;
        }

        public ConditionBuilder fuzzyImdbNub (List<String> fuzzyImdbNub){
            this.fuzzyImdbNub = fuzzyImdbNub;
            return this;
        }

        public ConditionBuilder fuzzyImdbNub (String ... fuzzyImdbNub){
            this.fuzzyImdbNub = solveNullList(fuzzyImdbNub);
            return this;
        }

        public ConditionBuilder rightFuzzyImdbNub (List<String> rightFuzzyImdbNub){
            this.rightFuzzyImdbNub = rightFuzzyImdbNub;
            return this;
        }

        public ConditionBuilder rightFuzzyImdbNub (String ... rightFuzzyImdbNub){
            this.rightFuzzyImdbNub = solveNullList(rightFuzzyImdbNub);
            return this;
        }

        public ConditionBuilder imdbNubList(String ... imdbNub){
            this.imdbNubList = solveNullList(imdbNub);
            return this;
        }

        public ConditionBuilder imdbNubList(List<String> imdbNub){
            this.imdbNubList = imdbNub;
            return this;
        }

        public ConditionBuilder fuzzyIsBan (List<String> fuzzyIsBan){
            this.fuzzyIsBan = fuzzyIsBan;
            return this;
        }

        public ConditionBuilder fuzzyIsBan (String ... fuzzyIsBan){
            this.fuzzyIsBan = solveNullList(fuzzyIsBan);
            return this;
        }

        public ConditionBuilder rightFuzzyIsBan (List<String> rightFuzzyIsBan){
            this.rightFuzzyIsBan = rightFuzzyIsBan;
            return this;
        }

        public ConditionBuilder rightFuzzyIsBan (String ... rightFuzzyIsBan){
            this.rightFuzzyIsBan = solveNullList(rightFuzzyIsBan);
            return this;
        }

        public ConditionBuilder isBanList(String ... isBan){
            this.isBanList = solveNullList(isBan);
            return this;
        }

        public ConditionBuilder isBanList(List<String> isBan){
            this.isBanList = isBan;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private ChNameList obj;

        public Builder(){
            this.obj = new ChNameList();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder engName(String engName){
            this.obj.setEngName(engName);
            return this;
        }
        public Builder chName(String chName){
            this.obj.setChName(chName);
            return this;
        }
        public Builder imdbNub(String imdbNub){
            this.obj.setImdbNub(imdbNub);
            return this;
        }
        public Builder isBan(String isBan){
            this.obj.setIsBan(isBan);
            return this;
        }
        public ChNameList build(){return obj;}
    }

}
