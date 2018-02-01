/*
 * This file is part of HopsWorks
 *
 * Copyright (C) 2013 - 2018, Logical Clocks AB and RISE SICS AB. All rights reserved.
 *
 * HopsWorks is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * HopsWorks is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with HopsWorks.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.hops.hopsworks.common.dao.jobs;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
public class FilesToRemovePK implements Serializable {

  @Basic(optional = false)
  @NotNull
  @Column(name = "execution_id")
  private long executionId;

  @Basic(optional = false)
  @NotNull
  @Size(min = 1,
      max = 255)
  @Column(name = "filepath")
  private String filepath;

  public FilesToRemovePK() {
  }

  public FilesToRemovePK(long executionId, String path) {
    this.executionId = executionId;
    this.filepath = path;
  }

  public long getExecutionId() {
    return executionId;
  }

  public void setExecutionId(long executionId) {
    this.executionId = executionId;
  }

  public String getFilepath() {
    return filepath;
  }

  public void setFilepath(String filepath) {
    this.filepath = filepath;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (int) executionId;
    hash += (filepath != null ? filepath.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof FilesToRemovePK)) {
      return false;
    }
    FilesToRemovePK other = (FilesToRemovePK) object;
    if (this.executionId != other.executionId) {
      return false;
    }
    return this.filepath.equals(other.filepath);
  }

  @Override
  public String toString() {
    return "se.kth.bbc.job.FilesToRemovePK[ jobId=" + executionId + ", path=" + filepath + " ]";
  }

}
