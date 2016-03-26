package com.zgld.api.beans;

/**
 * AbstractHishopRelatedArticsProductsId entity provides the base persistence
 * definition of the HishopRelatedArticsProductsId entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopRelatedArticsProductsId implements java.io.Serializable {

	// Fields

	private Integer articleId;
	private Integer relatedProductId;

	// Constructors

	/** default constructor */
	public AbstractHishopRelatedArticsProductsId() {
	}

	/** full constructor */
	public AbstractHishopRelatedArticsProductsId(Integer articleId, Integer relatedProductId) {
		this.articleId = articleId;
		this.relatedProductId = relatedProductId;
	}

	// Property accessors

	public Integer getArticleId() {
		return this.articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public Integer getRelatedProductId() {
		return this.relatedProductId;
	}

	public void setRelatedProductId(Integer relatedProductId) {
		this.relatedProductId = relatedProductId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractHishopRelatedArticsProductsId))
			return false;
		AbstractHishopRelatedArticsProductsId castOther = (AbstractHishopRelatedArticsProductsId) other;

		return ((this.getArticleId() == castOther.getArticleId()) || (this.getArticleId() != null && castOther.getArticleId() != null && this.getArticleId().equals(castOther.getArticleId()))) && ((this.getRelatedProductId() == castOther.getRelatedProductId()) || (this.getRelatedProductId() != null && castOther.getRelatedProductId() != null && this.getRelatedProductId().equals(castOther.getRelatedProductId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getArticleId() == null ? 0 : this.getArticleId().hashCode());
		result = 37 * result + (getRelatedProductId() == null ? 0 : this.getRelatedProductId().hashCode());
		return result;
	}

}