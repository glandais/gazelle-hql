package net.ihe.gazelle.common.filter.hql;

public class HQLRestrictionIsEmpty implements HQLRestriction{
	
	private String propertyName;

	HQLRestrictionIsEmpty(String propertyName) {
		super();
		this.propertyName = propertyName;
	}

	@Override
	public void toHQL(HQLQueryBuilder<?> queryBuilder, HQLRestrictionValues values, StringBuilder sb) {
		sb.append(queryBuilder.getShortProperty(propertyName)).append(" is empty");
	}

}
